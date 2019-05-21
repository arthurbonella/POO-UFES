package Exercício_19;

interface ObjetoGeometrico {
   	/**
   	 * O método centro retorna o ponto em duas dimensões que corresponde ao centro
   	 * do objeto geométrico.
   	 * @return uma instância da classe Ponto2D representando o centro do objeto
   	 *     	geométrico.
   	 */
   	Ponto centro();
 
   	/**
   	 * O método calculaÁrea calcula a área do objeto geométrico e retorna a área
   	 * como um valor do tipo double.
   	 * @return a área deste objeto geométrico.
   	 */
   	double calculaÁrea();
 
   	/**
   	 * O método calculaPerímetro calcula o perímetro do objeto geométrico e retorna o
   	 * perímetro como um valor do tipo double.
   	 * @return o perímetro deste objeto geométrico.
   	 */
   	double calculaPerímetro();
 
}
 
