

var Utility=require('../functional/Utility.js')


function replace()
{  
    var read=Utility.input();
    read.question("enter your name:",function(userinput)
    {
        
        Utility.replace(userinput);
        read.close();
    }
);
}

replace();