var Utility=require('../functional/Utility.js')


function primeFactor()
{
   var read=Utility.input();

   read.question("Enter a number:",function(num)
   {
       Utility.primeFactor(num);
       read.close();

   }
   
   
   );


}


primeFactor();