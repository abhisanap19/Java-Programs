var Utility=require('../functional/Utility.js')


function getCoupon()
{
    var read=Utility.input();
    read.question("enter no. of coupons:",function(n)
    {
          Utility.getCoupon(n);
        read.close();
            
    });
    

}

getCoupon();

