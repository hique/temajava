public class Desenho{
    	
	//public void desenhaQuadrado(){
    //FOR para desenhar as 5 linhas
	//	for(int i=0; i<5; i++){
			
			//em cada linha, desenho 5 colunas
	//		for(int j=0; j<5; j++){
				//como devo desenhar tudo na mesma linha, uso o print e nao o println
	//			System.out.print("* ");
	//		}
			
			//após terminar de desenhar as colunas, eu faço uma quebra
			//de linha para iniciar a próxima linha
	//		System.out.print("\n");
	//	}
	//	System.out.print("\n");
	//}
        
        public void desenhaRetangulo(int largura, int altura, char simbolo){
          
            for(int largura = 0; largura < 10; largura++){
                
                for(int altura = 0; altura < 5; altura++){
                    System.out.print("@");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
            
            }
}