# Alura-Java Design Patterns I
- Strategy: em um sistema que envolva muitos cálculos que variam de acordo com um determinado parâmetro o código pode ficar cheio de if e else. O padrão Strategy serve para deixar o código mais coeso onde cada classe tem a sua estratégia específica, utilizando-se de interfaces para evitar acoplamentos altos.
- Chain of Responsability: tem objetivo similar ao padrão strategy, evitar muitos if else e classes que não param de crescer. A diferença é que neste caso o parâmetro que infere nos cálculos não é somente de um tipo, por exemplo em cálculo de descontos, onde há descontos de acordo com o valor da compra, quantidade de itens e etc o padrão chain of responsability é mais adequado. https://refactoring.guru/design-patterns/chain-of-responsibility.
