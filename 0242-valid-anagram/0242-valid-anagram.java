class Solution
{
    public boolean isAnagram(String s, String t) 
    {
        if(s.length() == t.length())
        {
            for(char c : s.toCharArray())
            {
                if(t.indexOf(c) > -1)
                    t = t.replaceFirst(String.valueOf(c),"");
                else
                    return false;
                //System.out.println(t);
            }
            return true;
        }
        else
            return false;
    }
}