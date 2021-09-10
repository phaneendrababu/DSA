package stacks;

import java.util.*;
public class ValidParenthesis 
{
	public boolean isValid(String s) 
	{
	        Stack<Character> stack=new  Stack<Character>();
	        for(int i=0;i<s.length();i++)
	        {
	            char c=s.charAt(i);
	            if(c=='('|| c=='[' || c=='{')
	            {
	                stack.push(c);
	            }
	            else if(c==')')
	            {
	                if(stack.isEmpty())
	                {
	                    return false;
	                }
	                else if(stack.peek()!='(')
	                {
	                    return false;
	                }
	                else
	                {
	                    stack.pop();
	                }
	            }
	            else if(c==']')
	            {
	                if(stack.isEmpty())
	                {
	                    return false;
	                }
	                else if(stack.peek()!='[')
	                {
	                    return false;
	                }
	                else
	                {
	                   stack.pop();
	                }
	            }
	            else if(c=='}')
	            {
	                if(stack.isEmpty())
	                {
	                    return false;
	                }
	                else if(stack.peek()!='{')
	                {
	                    return false;
	                }
	                else
	                {
	                    stack.pop();
	                }
	            }
	        }
	        if(!stack.isEmpty())
	        {
	            return false;
	        }
	        return true;
	    }
}

/*
 Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
Example 4:

Input: s = "([)]"
Output: false
Example 5:

Input: s = "{[]}"
Output: true

 */