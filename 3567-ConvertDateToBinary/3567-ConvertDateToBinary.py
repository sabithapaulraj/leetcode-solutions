# Last updated: 6/17/2025, 10:24:23 PM
class Solution:
    def convertDateToBinary(self, date: str) -> str:
        a=date.split("-")
        b=[]
        for i in a:
            x=bin(int(i))
            x=x[2:]
            b.append(x)

        ans=""
        count=0
        for z in b:
            count+=1
            ans+=z
            if count < 3:
                ans+= "-"
        return ans