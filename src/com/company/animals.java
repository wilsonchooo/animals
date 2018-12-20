package com.company;

public class animals {
    public animals (


    public int numWordsofLength(int len)
    {
        int count =0;
        for (String words: myList)
        {
            if (words.length()==len)
            {
                count++;
            }
        }
        return count;
    }

    public void removeWordsofLength(int len)
    {
        for (int i = myList.size()-1;i>=0;i--);
        {
            if (myList.get(i).length()==len)
            {
                myList.remove(i);
            }
        }
    }
}
