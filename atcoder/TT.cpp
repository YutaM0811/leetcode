# include <iostream>
# include <iomanip>
using namespace std;

int main() {
    double D;
    cin>>D;
    double p=3.141592653589793;
    double h=D/2;
    cout<<setprecision(16)<<h*h*p<<endl;
    return 0;
}
