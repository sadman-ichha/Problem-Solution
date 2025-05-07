#include <iostream>
using namespace std;

int main()
{
    int rows = 3, cols = 3;
    // Outer loop: Controls the number of rows
    for (int i = 0; i < rows; i++){
        // Inner loop: Controls the number of columns in each row
        for (int j = 0; j < cols; j++){
            cout << "* ";
            
        }
        cout << endl; /// move to next line after each row 
    }

    return 0;
}
