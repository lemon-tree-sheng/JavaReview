short a = 1;
		
//下面两句不会报错，+=和-=会自动检查类型并进行强制类型转换
a+=1;
a-=1;
//下面一句会报错，因为 a+1 会转换为int类型，而由short类型来接收会发生编译错误，不会产生强制类型转换
a=a+1;