var Utility=require('../functional/Utility.js')


function gambling()
{

    var read=Utility.input();
 
     read.question("Enter $stake:",function(stake)
     {
         read.question("Enter $goal:",function(goal)
         {
             read.question("Enter no. of trails:",function(num)
             {

                Utility.gambling(stake,goal,num);
             }
             )
         }
         
         
         )
     }
     
     
     );


}

gambling();


