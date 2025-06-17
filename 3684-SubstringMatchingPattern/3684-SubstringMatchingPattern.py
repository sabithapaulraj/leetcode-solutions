# Last updated: 6/17/2025, 10:24:33 PM
class Solution:
    def hasMatch(self, string: str, pattern: str) -> bool:
        return re.findall(pattern.replace('*', '.*'), string) != []