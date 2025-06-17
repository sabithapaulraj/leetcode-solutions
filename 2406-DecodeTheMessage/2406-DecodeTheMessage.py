# Last updated: 6/17/2025, 10:25:02 PM
class Solution:
    def decodeMessage(self, key: str, message: str) -> str:
        substitution_table = {}
        alphabet = 'abcdefghijklmnopqrstuvwxyz'
        index = 0
        for char in key:
            if char not in substitution_table and char != ' ':
                substitution_table[char] = alphabet[index]
                index += 1
        decoded_message = []
        for char in message:
            if char == ' ':
                decoded_message.append(' ')
            else:
                decoded_message.append(substitution_table[char])
        
        return ''.join(decoded_message)