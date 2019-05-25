public class FlourPackProblem {
    public static void main(String[] args){
        System.out.println(canPack(1,0,5));
    }
    public static boolean canPack(int bigCount,int smallCount,int goal)
    {
       if((bigCount>=0) && (smallCount>=0) && (goal>=0))
       {
           if(bigCount*5 <=goal)
           {
               if((bigCount*5) +smallCount >=goal)
               {
                   return true;
               }
               return false;
           }
           return false;
       }
       return false;
    }
}


