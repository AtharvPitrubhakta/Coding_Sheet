#include<iostream>
using namespace std;

int main() {

// Pattern-1
// * * * * * 
// * * * * * 
// * * * * * 

// // Printing Solid Rectangle
//     // Outer loop - row observe
//     for(int row = 0; row < 3; row++) 
//     {   
//         // inner loop - col observe
//         for(int col = 0; col < 5; col++)
//         {
//             cout << "* ";
//         }
//         cout << endl;
//     }

// ------------------------------------------------------------------------------------------------

// Pattern-2
// * * * * 
// * * * * 
// * * * * 
// * * * * 

    // int n;
    // cin >> n;
    // Solid Rectangle 
    // outer loop
    // row += 1 is same as row = row + 1
    // for(int row = 0; row < n; row += 1)
    // {
    //     // inner
    //     // col += 1 is same as col = col + 1
    //     for(int col = 0; col < n; col += 1) 
    //     {
    //         cout << "* ";
    //     }
    //     cout << endl;
    // }

// ------------------------------------------------------------------------------------------------

// Hollow Rectangle
// * * * * * * * *
// *             *
// *             *
// *             *
// *             *
// * * * * * * * *

    // int rowCount, colCount;
    // cin >> rowCount;
    // cin >> colCount;
    
    // // Hollow Rectagle
    // for(int row = 0; row < rowCount; row += 1)
    // {   
    //     if(row == 0 || row == rowCount-1) 
    //     {
    //         for(int col = 0; col < colCount; col++)
    //         {
    //             cout << "* ";
    //         }
    //     }
    //     else {
    //         cout << "* ";
    //         for(int col = 0; col < colCount-2; col++)
    //         {
    //             cout << "  ";
    //         }
    //         cout << "*";
    //     }
    //     cout << endl;
    // }

// ------------------------------------------------------------------------------------------------

// Half Pyramid
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 

    // int n;
    // cin >> n;

    // for(int row = 0; row < n; row++)
    // {
    //     for(int col = 0; col < row + 1; col++)
    //     {
    //         cout << "* ";
    //     }

    //     cout << endl;
    // }    

// ------------------------------------------------------------------------------------------------

// Inverted Half Pyramid
// * * * * * 
// * * * * 
// * * * 
// * * 
// *

    // int n;
    // cin >> n;

    // for(int row = 0; row < n; row++)
    // {
    //     for(int col = 0; col < n-row; col++)
    //     {
    //         cout << "* ";
    //     }
    //     cout << endl;
    // }

// ------------------------------------------------------------------------------------------------

// Numeric Half Pyramid
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

    // int n;
    // cin >> n;

    // for(int row = 0; row < n; row++)
    // {
    //     for(int col = 0; col < row + 1; col++)
    //     {
    //         cout << col + 1 << " ";
    //     }
    //     cout << endl;
    // }

// ------------------------------------------------------------------------------------------------

// Inverted Half Pyramid
// 1 2 3 4
// 1 2 3
// 1 2
// 1

//     int n;
//     cin >> n;

//     for(int row = 0; row < n; row++)
//     {
//         for(int col = 0; col < n - row; col++)
//         {
//             cout << col + 1 << " ";
//         }
//         cout << endl;
//     }

// ------------------------------------------------------------------------------------------------

// FULL PYRAMID
//        *
//       * *
//      * * *
//     * * * *
//    * * * * *
//   * * * * * *

    // int n;
    // cin >> n;
    // for(int row = 0; row < n; row++)
    // {
        // First Formula
        // for(int col = 0; col < n - 1 - row; col++)
        // Second Formula
        // for(int col = 0; col < n - row+1; col++)

    //     {
    //         cout << " ";
    //     }
    //     for (int  i   = 0; i < row + 1; i++)
    //     {
    //         cout << "* " ;
    //     }
    //     cout << endl;

    // }

// ------------------------------------------------------------------------------------------------

// INVERTED FULL PYRAMID
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 

    // int n;
    // cin >> n;
    // for(int row = 0; row < n; row++)
    // {
    //     for(int col = 0; col < row; col++)
    //     {
    //         cout << " ";
    //     }
    //     for(int col = 0; col < n - row; col++)
    //     {
    //         cout << "* ";
    //     }   
    //     cout << endl;
    // }

// ------------------------------------------------------------------------------------------------

// FULL + INVERTED FULL PYRAMID
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *

    // int n;
    // cin >> n;
    
    // // Full Pyramid
    // for(int row = 0; row < n; row++)
    // {
    //     // spaces
    //     for(int col = 0; col < n - row - 1; col++)
    //     {
    //         cout << " ";
    //     }
        
    //     // stars
    //     for(int col = 0; col < row + 1; col++)
    //     {
    //         cout << "* ";
    //     }
    //     cout << endl;
    // }

    // // Inverted full pyramid
    // for(int row = 0; row < n; row++)
    // {
    //     // spaces
    //     for(int col = 0; col < row; col++)
    //     {
    //         cout << " ";
    //     }

    //     // stars
    //     for(int col = 0; col < n - row; col++)
    //     {
    //         cout << "* ";
    //     }
    //     cout << endl;
    // }

// ------------------------------------------------------------------------------------------------

// HOLLOW DIAMOND PYRAMID
//     *
//    * *
//   *   *
//  *     *
// *       *
// *       *
//  *     *
//   *   *
//    * *
//     *

    // int n;
    // cin >> n;
    
    // Full Pyramid
    // Upper Part
    // for(int row = 0; row < n; row++)
    // {
    //     // spaces
    //     for(int col = 0; col < n - row - 1; col++)
    //     {
    //         cout << " ";
    //     }
        
    //     // stars
    //     for(int col = 0; col < 2 * row + 1; col++)
    //     {
    //         // if first character
    //         if(col == 0) {
    //             // first character
    //             cout << "*";
    //         }
    //         else if(col == 2*row) {
    //             // last character
    //             cout << "*";
    //         }
    //         else {
    //             cout << " ";
    //         }
    //     }
        
    //     cout << endl;
    // }

    // Inverted Pyramid
    // Lower Part
    // for(int row = 0; row < n; row++)
    // {
    //     // spaces
    //     for(int col = 0; col < row; col++)
    //     {
    //         cout << " ";
    //     }

    //     // stars
    //     for(int col = 0; col < 2*n - 2*row - 1; col++)
    //     {
    //         // if start or last character
    //         if(col == 0 || col == 2*n - 2*row - 2){
    //             cout << "*";
    //         }
    //         else{
    //             cout << " ";
    //         }
    //     }
    //     cout << endl;
    // }

// ------------------------------------------------------------------------------------------------

// Flipped Solid Diamond
// ***********
// ***** *****
// ****   ****
// ***     ***
// **       **
// *         *
// *         *
// **       **
// ***     ***
// ****   ****
// ***** *****
// ***********

    // int n;
    // cin >> n;

    // // Upper Part
    // for(int row = 0; row < n; row++)
    // {
    //     // Half Pyramid With Stars
    //     for(int col = 0; col < n - row -1; col++)
    //     {
    //         cout << "*";
    //     }

    //     // Space Walla Full Pyramid With Starts
    //     for(int col = 0; col < 2 * row + 1; col++)
    //     {   
    //         // Print First & Last Character
    //         if(col == 0 || col ==  2*row)
    //         {
    //             cout << "*";
    //         }
    //         else {
    //             cout << " ";
    //         }
    //     }

    //     // Half Pyramid With Stars
    //     for(int col = 0; col < n - row -1; col++)
    //     {
    //         cout << "*";
    //     }

    //     cout << endl;
    // }


    // // Lower Part
    // for(int row = 0; row < n; row++)
    // {
    //     // Half Pyramid With Stars
    //     for(int col = 0; col < row; col++)
    //     {
    //         cout << "*";
    //     }

    //     // Space Walla Full Pyramid With Stars
    //     for(int col = 0; col < 2*n - 2*row - 1; col++)
    //     {
    //         // Print the First and Last character 
    //         if(col == 0 || col == 2*n - 2*row - 2)
    //         {
    //             cout << "*";
    //         }
    //         else{
    //             cout << " ";
    //         }
    //     }
        
    //     // Half Pyramid With Stars
    //     for(int col = 0; col < row; col++)
    //     {
    //         cout << "*";
    //     }

    //     cout << endl;
    // }


// ------------------------------------------------------------------------------------------------


// Fancy Pattern #2
// 1
// 2*2
// 3*3*3
// 4*4*4*4
// 4*4*4*4
// 3*3*3
// 2*2
// 1

    // int n;
    // cin >> n;

    // for(int row = 0; row < n; row++)
    // {
    //     for(int col = 0; col < row+1; col++)
    //     {
    //         cout << row+1;
    //         if(col != row){
    //             cout << "*";
    //         }
    //     }
    //     cout << endl;
    // }

    // for(int row = 0; row < n; row++)
    // {
    //     for(int col = 0; col < n - row ; col++)
    //     {
    //         cout << n-row;
    //         if(col != n-row-1){
    //             cout << "*";
    //         }
    //     }
    //     cout << endl;
    // }


// ------------------------------------------------------------------------------------------------


// Numbers Palindrome Pyramid
// 1
// 1 2 1
// 1 2 3 2 1
// 1 2 3 4 3 2 1

    // int n;
    // cin >> n;

    // for(int row = 0; row < n; row++)
    // {
    //     int col;
    //     for(col = 0; col < row+1; col++)
    //     {
    //         cout << col + 1 << " ";
    //     }

    //     // reverse counting printing
    //     for(int col = row; col >= 1; col--)
    //     {
    //         cout << col << " ";
    //     }
        
    //     cout << endl;
    // }


// ------------------------------------------------------------------------------------------------

// Alphabet Palindrome Pyramid
// A
// A B A
// A B C B A
// A B C D C B A

    // int n;
    // cin >> n;

    // for(int row = 0; row < n; row++)
    // {
    //     for(int col = 0; col < row + 1; col++)
    //     {
    //         int ans = col + 1;
    //         char ch = ans + 'A' - 1;
    //         cout << ch << " ";
    //     }
        
    //     // Reverse Counting Printing
    //     for(int col = row; col >= 1; col--)
    //     {
    //         int ans = col;
    //         char ch = ans + 'A' - 1;
    //         cout << ch << " ";
    //     }

    //     cout << endl;
    // }


// ------------------------------------------------------------------------------------------------

// Solid Square Pattern
// * * * * * *
// * * * * * *
// * * * * * *
 // * * * * * *
// * * * * * *
// * * * * * *
    // int n;
    // cin >> n;

    // for(int row = 0; row < n; row++)
    // {
    //     for(int col = 0; col < n; col++)
    //     {
    //         cout << "* ";
    //     }
    //     cout << endl;
    // }


// ------------------------------------------------------------------------------------------------

// Hollow Square Pattern
// * * * * * * * *
// *             *
// *             *
// *             *
// *             *
// * * * * * * * *

    // int rowCount, colCount;
    // cin >> rowCount;
    // cin >> colCount;

    // for(int row = 0; row < rowCount; row++)
    // {

    //     if(row == 0 || row == rowCount-1)
    //     {
    //         for(int col = 0; col < colCount; col++)
    //         {
    //             cout << "* ";
    //         }
    //     }
    //     else {
    //         cout << "* ";
    //         for(int col = 0; col < colCount-2; col++)
    //         {
    //             cout << "  ";
    //         }
    //         cout << "*";
    //     }
    //     cout << endl;
    // }

// ------------------------------------------------------------------------------------------------

// 1 
// 2 3 
// 3 4 5 
// 4 5 6 7 
// 5 6 7 8 9

    // int n;
    // cin >> n;
    // for(int row = 0; row < n; row++)
    // {
    //     int start = row + 1;
    //     for(int col = 0; col < row+1; col++)
    //     {
    //         cout << start << " ";
    //         start = start + 1;
    //             // OR
    //         // cout << row + col + 1 << " ";
    //     }
    //     cout << endl;
    // }

// Numeric Full Pyramid
//     1
//    232
//   34543
//  4567654
// 567898765

    // int n;
    // cin >> n;

    // for(int row = 0; row < n; row++)
    // {
    //     // Spaces
    //     for(int col = 0; col < n-row-1; col++)
    //     {
    //         cout << " ";
    //     }

    //     // Numbers
    //     for(int col = 0; col < row+1; col++)
    //     {
    //         cout << row + col + 1;
    //     }

    //     // Reverse Counting 
    //     int start = 2 * row;
    //     for(int col = 0; col < row; col++)
    //     {
    //         cout << start;
    //         start--;
    //     }
    //     cout << endl;
    // }

// ------------------------------------------------------------------------------------------------

// Numeric Hollow Pyramid
//     1
//    1 2
//   1   3
//  1     4
// 1 2 3 4 5
 
    // int n;
    // cin >> n;

    // for(int row = 0; row < n; row++)
    // {
    //     // spaces
    //     for(int col = 0; col < n-1-row; col++){
    //         cout << " ";
    //     }

    //     // numbers with spaces in between 
    //     // Odd number formula = [2*row+1]
    //     int start = 1;
    //     for(int col = 0; col < 2*row+1; col++) {
    //         // first row or last row
    //         if(col == 0 || row == n-1) {
    //             if(col % 2 == 0) {
    //                 // even
    //                 cout << start;
    //                 start++;
    //             }
    //             else {
    //                 // odd
    //                 cout << " ";
    //             }
    //         }
    //         else {
    //             // first col
    //             if(col == 0) {
    //                 cout << 1;
    //             }
    //             else if(col == 2*row+1-1) {
    //                 cout << row+1;
    //             } 
    //             else {
    //                 cout << " ";
    //             }
    //         }
    //     }
    //     cout << endl;
    // }














    int n;
    cin >> n;

    for(int row = 0; row < n; row++)
    {
        // Spaces 
        for(int col = 0; col < n-row-1; col++)
        {
            cout << " ";
        }

        // Numbers with spaces 
        int start = 1;
        for(int col = 0; col < 2*row+1; col++)
        {
            // First and Last Numbers
            if(row == 0 || row == n-1) {
                if(col % 2 == 0) {
                    cout << start;
                    start++;
                }
                else {
                    cout << " ";
                }
            } 
            else {
                // Middle part
                // First Col
                if(col == 0) {
                    cout << 1;
                }
                // Last col
                else if(col == 2*row+1-1) {
                    cout << row + 1;
                }
                else {
                    cout << " ";
                }
            }

            
        }
        cout << endl;
    }






    return 0;
}


// 