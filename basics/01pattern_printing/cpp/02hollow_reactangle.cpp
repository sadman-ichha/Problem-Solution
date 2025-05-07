#include <iostream>
using namespace std;

int main()
{
    int rows = 3, cols = 5;
    for (int i = 0; i < rows; i++){
        for (int j = 0; j < cols; j++){
            if (i == 1 ){
                if (j == 0 || j == 4){
                    cout<<"*";
                }else{
                    cout<<" ";
                }
            }
            else{
                cout << "*";
            }         
        }
        cout << endl;
    }

    return 0;
}