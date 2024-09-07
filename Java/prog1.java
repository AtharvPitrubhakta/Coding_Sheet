// 3) to print the command line arguments in sorted manner (assume numbers)

class prog1
{
public static void main(String[] args)
{
int x[]=new int[args.length];
for(int i=0;i<args.length;i++)
x[i]=Integer.valueOf(args[i]);

for(int i=0;i<x.length;i++)
for(int j=i+1;j<x.length;j++)
if(x[i]>x[j])
{
int t=x[i];
x[i]=x[j];
x[j]=t;
}

for(int i=0;i<x.length;i++)
System.out.print(x[i]+" ");
}
}
