class myinsertion
{
	private int[] bil;		//deklarasi array a
	private int n;
//-------------------------------------------------
	public myinsertion (int max)
	{
	bil = new int[max];
	n = 1;
	}
//-------------------------------------------------
	public void insert (int nilai)
	{
	bil [n] = nilai;
	n++;
	}
//-------------------------------------------------
	public void display()
	{
		for (int j=1; j<n; j++)
			System.out.print(bil[j] + " ");
		System.out.println();
	}
//-------------------------------------------------
	public void InsertionSort()
	{
	int temp, x, j;
	for( j = 1; j <= 10; j++)
		{
		temp = bil[j];
		x = j-1;
			while (x>=0 && bil[x] > temp)
			{
				bil[x+1] = bil[x];
				x--;
			}
		bil[x+1] = temp;
		}
	}
}
//-------------------------------------------------