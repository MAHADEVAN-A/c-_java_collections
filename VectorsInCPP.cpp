#include <iostream>
#include <vector>

using namespace std;

void printVector(vector<int>& vec)
{
    for (int a : vec)
    {
        cout << a << " ";
    }
    cout<<'\n';
}


int main()
{

	#ifndef ONLINE_JUDGE
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
	#endif

	/////////////////////////////////////
	//         Vectors in C++          //
	/////////////////////////////////////


	// vector<int> v;

	// v.push_back(4);
	// v.push_back(3);
	// v.push_back(2);
	// v.push_back(8);
	// v.push_back(9);

	// for(vector<int>::iterator it = v.begin();it!=v.end();it++)
	// 	cout<<*it<<" ";
	// cout<<endl;

	// for(vector<int>::reverse_iterator it = v.rbegin();it!=v.rend();it++)
	// 	cout<<*it<<" ";
	// cout<<endl;


	// for(auto it = v.begin();it!=v.end();it++)
	// 	cout<<*it<<" ";
	// cout<<endl;

	// for(auto it = v.rbegin();it!=v.rend();it++)
	// 	cout<<*it<<" ";
	// cout<<endl;


	// cout<<v.size()<<" "<<v.capacity()<<'\n';

	// v.shrink_to_fit();

	// cout<<v.size()<<" "<<v.capacity()<<'\n';

	// v.pop_back();

	// printVector(v);

	// v.erase(v.begin()+1,v.begin()+2);

	// printVector(v);

	// v.insert(v.begin()+2,9);

	// printVector(v);

	// v.clear();

	// cout<<v.size()<<'\n';

	// vector<int> u(5,1);

	// printVector(u);

	// int n = 5;
	// int arr[] = {1,2,3,4,5};

	// vector<int> w(arr,arr+n);

	// printVector(w);

	// vector<vector<int>> twoD(5,vector<int>(5,1));

	// cout<<'\n';
	// for(auto row: twoD)
	// {
	// 	for(auto col: row)
	// 		cout<<col<<" ";
	// 	cout<<'\n';
	// }

	



	return 0;
}