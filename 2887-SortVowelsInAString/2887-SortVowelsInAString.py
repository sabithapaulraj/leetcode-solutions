# Last updated: 6/17/2025, 10:24:44 PM
class Solution:
    def sortVowels(self, s: str) -> str:
        vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}
        sorted_vowels = sorted([char for char in s if char in vowels])
        vowel_iter = iter(sorted_vowels)
        result = [next(vowel_iter) if char in vowels else char for char in s]  
        return ''.join(result)