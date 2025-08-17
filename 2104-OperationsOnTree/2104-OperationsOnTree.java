// Last updated: 8/17/2025, 8:38:57 PM
class LockingTree {
    int[] parent; //store the parent
    List<Integer>[] children; //list of children
    int[] lockedBy; // list of users who locked each node (0 = unlocked)

    public LockingTree(int[] parent) {
        this.parent = parent;
        int n = parent.length;
        lockedBy = new int[n];
        children = new ArrayList[n];
        for(int i = 0; i < n; i++){
            children[i] = new ArrayList<>();
        }
        for(int i = 1; i < n; i++){
            children[parent[i]].add(i); //child list
        }
        
    }
    
    public boolean lock(int num, int user) {
        if(lockedBy[num] == 0){ // first check if its unlocked
            lockedBy[num] = user;
            return true;
        }
        return false;
    }
    
    public boolean unlock(int num, int user) {
        if(lockedBy[num] == user){
            lockedBy[num] = 0;
            return true;
        }
        return false;
        
    }
    
    public boolean upgrade(int num, int user) {
        if(lockedBy[num] != 0){
            return false; // must be unlocked
        }
        if(!hasLockedDescendants(num)){
            return false; // if it doesnt have any locked descendants
        }
        if(hasLockedAncestors(num)){
            return false; // if it has locked ancestors
        }
        unlockAllDescendants(num); //unlock all children
        lockedBy[num] = user;      // lock this node
        return true;
    }
    private boolean hasLockedDescendants(int num){
        for(int child : children[num]){
            if(lockedBy[child] != 0){
                return true;
            }
            if(hasLockedDescendants(child)){ //recursive check 
                return true;
            }       
        }
        return false; 
    }
    private boolean hasLockedAncestors(int num){
        int p = parent[num];
        while(p != -1){// goes up until root
            if(lockedBy[p] != 0){
                return true;
            }
            p = parent[p]; // set p to parent of current ancestor
        }
        return false;
    }
    private void unlockAllDescendants(int num){
        for(int child : children[num]){
            lockedBy[child] = 0; // unlock all descendants
            unlockAllDescendants(child); // recursive unlock
        }
    }
}

/**
 * Your LockingTree object will be instantiated and called as such:
 * LockingTree obj = new LockingTree(parent);
 * boolean param_1 = obj.lock(num,user);
 * boolean param_2 = obj.unlock(num,user);
 * boolean param_3 = obj.upgrade(num,user);
 */