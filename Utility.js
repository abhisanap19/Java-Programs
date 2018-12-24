var read = require('readline-sync');

module.exports = {


    input() {
        var readLine = require('readline');
        var rl = readLine.createInterface({

            input: process.stdin,
            output: process.stdout

        });
        return rl;
    },
    inputread() {
        var indices = read.question("");
        return indices;
    },





    inputReadLineArray(arr, rl) {
        console.log("Enter " + rl + " elements");
        for (let i = 0; i < rl; i++) {
            arr[i] = read.question("");
        }
        return arr;
    },









    /**
     * 
     * Aim:User Input and Replace String Template “Hello <<UserName>>, How are you?”
     * @author Abhijeet Sanap
     * @version v10.11.0
     * @since 21/12/2018
     */

    replace(userinput) {
        if (userinput.length >= 3) //userinput should be atleast 3 characters
        {
            console.log("hello" + userinput + "! how are you?");
        }
        else {
            console.log("please enter username minimum 3 characters");
        }
    },


    /**
    * 
    * Aim:User Input and Replace String Template “Hello <<UserName>>, How are you?”
    * @author Abhijeet Sanap
    * @version v10.11.0
    * @since 21/12/2018
    */
    flipcoin(st) {
        let n = 0, head = 0, tail = 0;

        for (let i = 1; i <= st; i++) {
            n = Math.random();
            //console.log("the random outputs are:"+n);
            if (n >= 0.5) {
                head++;
            }
            else {
                tail++;
            }
        }
        console.log("no of heads is :" + head);
        console.log("no of tails is :" + tail);
        let hp = (head / st) * 100;
        console.log("the head% is :" + hp + "%");
        var tp = (tail / st) * 100;
        console.log("the tail% is :" + tp + "%");
    },



    /**
    * 
    * Aim:User Input and Replace String Template “Hello <<UserName>>, How are you?”
    * @author Abhijeet Sanap
    * @version v10.11.0
    * @since 21/12/2018
    */

    leapYear(year) {
        if (year.length == 4)    //check if length is
        {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)   //check if it is leap year or not
            {

                console.log("It is a leap year");
            }
            else {

                console.log("It is not leap year");
            }

        }
        else {
            console.log("Plz enter 4 digit number");
        }



    },


    /**
    * 
    * Aim:User Input and Replace String Template “Hello <<UserName>>, How are you?”
    * @author Abhijeet Sanap
    * @version v10.11.0
    * @since 21/12/2018
    */

    findPower(num) {

        var i = 0;
        var powerOfTwo = 1;

        while (i <= num)  //repeat until i equals n
        {
            console.log(i + "\t" + powerOfTwo);    //print power of two
            powerOfTwo = 2 * powerOfTwo;
            i = i + 1;
        }

    },




    /**
    * 
    * Aim:User Input and Replace String Template “Hello <<UserName>>, How are you?”
    * @author Abhijeet Sanap
    * @version v10.11.0
    * @since 21/12/2018
    */

    Harmonic(N) {
        var sum = 0.0;

        for (i = 1; i <= N; i++) {
            console.log("1/" + i + "+");
            sum += 1.0 / i;
        }

        console.log(sum);


    },





    /**
    * 
    * Aim:User Input and Replace String Template “Hello <<UserName>>, How are you?”
    * @author Abhijeet Sanap
    * @version v10.11.0
    * @since 21/12/2018
    */

    primeFactor(number) {
        for (let i = 2; i <= number / i; i++) {
            console.log("{i=" + i + ",number=" + number + " }");

            while (number % i == 0) {
                number = number / i;
                console.log("Factor: " + i);


            }
        }

        if (number > 1) {
            console.log("Factor: " + number);

        }


        console.log();


    },





    /**
    * 
    * Aim:User Input and Replace String Template “Hello <<UserName>>, How are you?”
    * @author Abhijeet Sanap
    * @version v10.11.0
    * @since 21/12/2018
    */

    gambling(stake, goal, num) {
        var bets = 0;
        var wins = 0;
        var loss = 0;

        for (i = 0; i < num; i++) {
            var cash = stake;

            while (cash > 0 && cash < goal) {
                bets++;


                if (Math.random() < 0.5) {
                    cash++;
                }
                else {
                    cash--;
                }
            }



            if (cash == goal) {
                wins++;
            }
            else {
                loss++;
            }
        }

        console.log(wins + " wins of " + num);
        console.log("percentage of wins=" + 100.0 * wins / num + "%");
        console.log(loss + " loss of " + num);
        console.log("percentage of loss=" + 100.0 * loss / num + "%");

    },



    /**
    * 
    * Aim:User Input and Replace String Template “Hello <<UserName>>, How are you?”
    * @author Abhijeet Sanap
    * @version v10.11.0
    * @since 21/12/2018
    */

    getCoupon(n) {
        var size = 0;
        var arr = new Array(n);

        while (size < n) {
            var x = Math.round(Math.random() * 1000);
            console.log(x);
            for (var i = 0; i < arr.length; i++) {
                if (arr[i] != x && x > 0) {
                    arr[i] = parseInt(x);
                    size++;
                }
            }
        }


    },





    /**
    * 
    * Aim:User Input and Replace String Template “Hello <<UserName>>, How are you?”
    * @author Abhijeet Sanap
    * @version v10.11.0
    * @since 21/12/2018
    */

    array(row, coloumn) {
        var prompt = require('prompt-sync')();
        let arr = new Array(row);
        // let arr1=new Array(coloumn);
        var coloumn = prompt('enter no of coloums');
        for (let i = 0; i < row; i++) {
            arr[i] = new Array(coloumn);
            for (let j = 0; j < coloumn; j++) {
                arr[i][j] = prompt('enter element: ');
            }
        }

        console.log(arr);
    },

    // array(row,col,arr)
    // {
    //     console.log("Your matrix is: ");
    //     for(let i=0;i<row;i++) {
    //     for(let j=0;j<col;j++) {

    //        console.log(arr[i][j]+"\t");

    //     }

    //     console.log();
    // }

    // },  







    /**
    * 
    * Aim:User Input and Replace String Template “Hello <<UserName>>, How are you?”
    * @author Abhijeet Sanap
    * @version v10.11.0
    * @since 21/12/2018
    */
    getTriplets(arr) {
        // var prompt=require('promt-sync')();
        //var arr=new Array(num);
        //var arr1=new Array();
        //var num=0;
        var count = 0;
        var num1 = 0;
        var num2 = 0;
        var flag = false;
        // for(let i=0;i<num;i++)
        // {
        //      arr[i]=prompt("Enter elements: ");
        //  }
        //  console.log(arr);


        for (let i = 0; i < arr.length - 2; i++) {
            for (let j = i + 1; j < arr.length - 1; j++) {
                for (let k = j + 1; k < arr.length; k++) {
                    if ((Number(arr[i]) + Number(arr[j]) + Number(arr[k])) == 0 && num1 == 0 && num2 == 0) {

                        num1++;
                        num2++;
                        count++
                        //arr1.push(arr[i]+','+arr[j]+','+arr[k]);
                        console.log("Triplets are: ", +arr[i] + "\t" + arr[j] + "\t" + arr[k] + "\t");
                        flag = true;
                    }
                }
            }
        }
        if (flag == false) {
            console.log("No triplets found");
        }
        return count;

        // var distinct=new Set(arr1);
        // console.log("distinct triplets= "+[...distinct]);
        //console.log("total no of triplets= "+[...distinct].length);


    },




    /**
    * 
    * Aim:User Input and Replace String Template “Hello <<UserName>>, How are you?”
    * @author Abhijeet Sanap
    * @version v10.11.0
    * @since 21/12/2018
    */


    getDistance(x, y) {
        var dist = Math.pow(((x * x) + (y * y)), 0.5);
        console.log("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);

    },


    /**
    * 
    * Aim:User Input and Replace String Template “Hello <<UserName>>, How are you?”
    * @author Abhijeet Sanap
    * @version v10.11.0
    * @since 21/12/2018
    */


    doPermute(str) {
        var a, z, A, Z;
        if ((str >= 'a' && str <= 'z') || (str >= 'A' && str <= 'Z')) {
            var permutations = [];
            doPerm1(str, []);
            console.log(permutations);


            function doPerm1(str, arr) {
                if (typeof (str) == 'string')
                    str = str.split('');// splitting string into characters
                if (str.length == 0)
                    permutations.push(arr.join(''));
                for (var i = 0; i < str.length; i++) {
                    var x = str.splice(i, 1);// it will remove one element from index i
                    arr.push(x);// it will add items to the end of the array
                    doPerm1(str, arr);
                    arr.pop();//it removes last element from array and returns that element
                    str.splice(i, 0, x);// from index i it will add x
                }

            }
        }
        else {
            console.log("please enter string");
        }
    },



      getTime()
      {
          var d=new Date();
          t=d.getTime();
          console.log(""+t);
        
          return t;

      },


      getElapsedTime(start,stop)
      {
          var elapsed=stop-start;
          return elapsed;
          //process.exit;
      },






    /**
    * 
    * Aim:User Input and Replace String Template “Hello <<UserName>>, How are you?”
    * @author Abhijeet Sanap
    * @version v10.11.0
    * @since 21/12/2018
    */



    findRoots(a, b, c) {
        var roots1;
        var roots2;
        var delta;
        var delta = b * b - 4 * a * c;


        if (delta > 0)          //real and distinct
        {
           var root1 = (-b + Math.sqrt(delta)) / (2 * a);
           var root2 = (-b - Math.sqrt(delta)) / (2 * a);
            console.log("Root1: " + root1);
            console.log("Root2: " + root2);

        }

        else if (delta == 0)     //real and equal
        {
            var root1= (-b+Math.sqrt(delta)) /(2 * a);
            console.log("Root1:" + root1);
        }


        else {
            
           console.log("roots are real and imaginary");
        }

    },




    findWC(t, v) {
        var t, v, w, a;
        a = Math.pow(v, 0.16);

        if (t < 50 && v < 120 && v > 3) {
            w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * a;
            console.log("windchill is:" + w);
        }
        else {
            console.log("invalid input");
        }
    },





}

