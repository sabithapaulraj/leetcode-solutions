# Last updated: 6/17/2025, 10:26:55 PM
class Solution:
    def partitionLabels(self, s: str) -> List[int]:
        red = green = 0
        out = []
        current_part_size = 0
        
        while (green < len(s) and red < len(s)):
            for i in range(red+1, len(s)):
                if s[i] == s[green]:
                    red = i
                    
            if green == red:
                red += 1
                out.append(current_part_size + 1)
                current_part_size = 0
            else:
                current_part_size += 1
            
            green += 1
        return out