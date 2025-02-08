Padrão de Projeto - Template Method
1. Introdução
O padrão de projeto Template Method é um padrão comportamental que define a estrutura de um algoritmo na superclasse e permite que subclasses personalizem partes do algoritmo sem alterar sua estrutura geral. Esse padrão é muito utilizado quando existem múltiplas variações de um mesmo processo, garantindo reutilização de código e padronização da lógica principal.
Ele é comumente aplicado em situações onde várias classes compartilham a mesma sequência de passos, mas precisam modificar detalhes específicos de sua implementação. Exemplos de aplicação incluem frameworks, sistemas de processamento de dados, algoritmos que seguem uma estrutura fixa e fluxos de trabalho padronizados.
2. Implementação do Padrão Template Method
O código implementado em Java demonstra o uso do Template Method no contexto de preparação de bebidas quentes. Neste exemplo, há diferentes tipos de bebidas, como café, chá e chocolate quente, que compartilham o mesmo processo de preparação com pequenas variações.

3. Explicação do Código


BebidaQuente: Classe abstrata que define o método template prepararBebida(), contendo a sequência de passos para preparar uma bebida quente.
Cafe: Subclasse que implementa os passos específicos para preparar café, como adicionar café e misturar com leite e açúcar.
Cha: Subclasse que implementa os passos específicos para preparar chá, como adicionar o saquinho de chá e um toque de limão.
ChocolateQuente: Subclasse adicional que implementa o processo específico para preparar chocolate quente.
TemplateMethodDemo: Classe principal que demonstra a execução do padrão Template Method ao preparar diferentes bebidas e exibir a saída esperada.
4. Resultado Esperado
A execução do programa deve gerar uma saída semelhante a esta:
Fervendo água...
Adicionando café...
Adicionando açúcar e leite...
Café está pronto!

Fervendo água...
Adicionando saquinho de chá...
Adicionando limão...
Chá está pronto!

Fervendo água...
Adicionando chocolate em pó...
Adicionando leite...
Chocolate quente está pronto!
Isso demonstra que todas as bebidas seguem a mesma estrutura de preparação, mas com diferenças específicas em seus ingredientes e modos de preparo.
5. Vantagens e Desvantagens
Vantagens:
Reutilização de código ao definir a estrutura geral do algoritmo.
Facilita a manutenção ao centralizar a lógica principal na classe base.
Padroniza a execução de métodos para diferentes variações de uma mesma funcionalidade.
Possibilita fácil expansão, permitindo a adição de novos tipos de bebidas sem alterar a estrutura principal.
Desvantagens:
Reduz a flexibilidade, pois a estrutura do algoritmo fica fixa na superclasse.
Pode levar a um acoplamento forte entre a classe base e as subclasses.
Para casos muito simples, pode adicionar complexidade desnecessária.
