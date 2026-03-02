class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []
        if len(s) == 0 or len(s) == 1:
            return False

        for i in range(len(s)):
            if s[i] == '{' or s[i] == '[' or s[i] == '(':
                stack.append(s[i])
            
            if len(stack) == 0:
                return False
            
            top = stack[-1]
            if s[i] == "}" and top != "{":
                return False
    
            if s[i] == ")" and top != "(":
                return False

            if s[i] == "]" and top != "[":
                return False

            if s[i] == "}" and top == "{":
                stack.pop()
                continue
    
            if s[i] == ")" and top == "(":
                stack.pop()
                continue

            if s[i] == "]" and top == "[":
                stack.pop()
                continue
                
        if len(stack) != 0:
            return False

        return True

        