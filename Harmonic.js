var Utility=require('../functional/Utility.js')

function Harmonic()
{
 
    var read=Utility.input();

    read.question("Enter value of N:",function(N)
    {
       

        Utility.Harmonic(N);
        read.close();

    }
    
    );
}

Harmonic();
