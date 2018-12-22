var readLine=require('readline');

var Utility=require('../functional/Utility.js')

var read=readLine.createInterface(
    {
        input:process.stdin,
        output:process.stdout
    }
);
function flipcoin()
{
    read.question("enter number of times to flip the coin: ",function(st)
    {
        
        Utility.flipcoin(st);
        read.close();
    }
);
}

flipcoin();