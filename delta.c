#include <stdio.h>
#include <math.h>

int main(){

    float a, b, c;
    scanf("%f %f %f", &a, &b, &c);
	
	if(a == 0){
		printf("Nao é equação de2° grau");
    }else{
	}
		float delta = b*b - 4*a*c;
		if (delta < 0) {
		printf("Não existe raiz real.\n");
	}
			else(delta == 0) {
				float raiz1 = (-b + sqrt(delta)) / (2*a);
					printf("Raíz Única: %f", raiz1);
	}
				else {
					float raiz1 = (-b + sqrt(delta)) / (2*a);
					float raiz2 = (-b + sqrt(delta)) / (2*a);
						printf("Raíz Única: %f %f", raiz1);
	}
	
    return EXIT_SUCCESS;
}
