#include<stdio.h>

#define H_TRA 100.00
#define H_EXT 150.00

int main(){

	int horas, salario = 0 ;
	
	scanf("%d", &horas);
	
	if (horas > 40) {
		salario = (40 * H_TRA)+ H_EXT * 150;
	}
	else
	{
		salario = horas * H_TRA;
		
	}
	if (salario > 2*40*H_TRA){
		salario = 2*40*H_TRA;				
	}
	
	printf("%d", salario);
	
	return 0;

}
