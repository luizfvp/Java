Crie uma classe ContaBancaria, que deverá ter os seguintes atributos privados: 
- numero (número da conta)
- titular (nome do titular da conta) 
- saldo (saldo atual)

Além disso, a classe deve ter métodos para:
- depositar dinheiro
- sacar dinheiro
- exibir o saldo atual

Implemente também um método que formate o nome do titular da conta para ser impresso no cartão, atendendo as seguintes regras: 
- Se o nome completo for por exemplo “Nayara Rocha Souza Ramos”, o método que você deverá implementar deverá gerar a String “NAYARA R. S. RAMOS”. 
Ou seja, o primeiro nome será apresentado com todas as letras maiúsculas

- os próximos nomes ou sobrenomes (exceto o último) serão abreviados, apresentando apenas a primeira letra em maiúsculo seguido do caractere “.” e o último sobrenome será impresso por completo e também com as letras maiúsculas. 
No entanto, para sobrenomes que tenham as preposições “de”, “da”, “das”, “do”,“dos” e “e”, essa preposição será omitida. 
Tome cuidado com a forma de implementar essa validação, pois existem alguns sobrenomes que não são preposições e possuem 3 caracteres ou menos. 
Segue um exemplo: o nome “Matheus dos Anjos Zoe”, tem a preposição “dos” que deverá ser ignorada na formatação do nome, mas tem o sobrenome “Zoe” que 
contém 3 caracteres e deverá ser exibido. Deste modo, esse nome formatado será “MATHEUS A. ZOE”. 