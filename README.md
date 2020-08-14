<h3 align="center"> Neural Network - Character Identification </h3>

## Equipe
 - Gustavo de Carvalho Santos
 - Paulo Henrique Rodrigues

## Problema
<p>O projeto tem como objetivo criar uma rede neural que permita identificar caracteres desenhados. O sistema contara com uma aplicação mobile que permitira ao usuário desenho na tela do celular, esse por sua vez será enviado para o servido que irar classificar o desenho tentando classificar o caracteres desenhado pelo usuário retornar o resultado para o usuário.</p>

## Dataset
Inicialmente o dataset será o THE MNIST DATABASE [disponível aqui.](http://yann.lecun.com/exdb/mnist/)

## Técnica
<p>
A técnica escolhida para realizar a classificação do caractere desenhado no telefone é a Rede Neural. 
</p>
<p>
Rede Neural é aplicação que tem como expiração o funcionamento do cérebro animal, o aplicativo é um conjunto de nó, nomeados de neurônios, organizados em camadas. Cada  neurônio realiza o processamento da entrada com o seu <b>peso</b> e propagam o resultado para os próximos neurônios. Esse processo se repete diversas vez durante o treinamento da rede neural onde o <b>peso</b> do neurônio é ajustado para melhorar a classificação do neurônio.
</p>

<p align="center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Neuralnetwork.png/330px-Neuralnetwork.png" height="206" width="330" alt="Unform" />
</p>

<p align="center">
Diagrama simplificado de uma rede neural. 
</p>

<p>
<h3>Quais serão as entradas da rede neural?</h3>
A entrada na rede neural será a imagem de um unico caracter numerico.
</br>

<h3>Quais serão as saídas da rede neural?</h3>
As saidas são a porcentagem de classificação do caracter numerico informado. Ou seja, o caracter informado se assemelha em x% com o caracter Y, z% com o caracter T assim para todos os numeros de 1 a 9.
</br>

<h3>Para validar a rede neural sera usado qual estrategia de validação?</h3>
A validação cruzada usado para validar a rede sera Validação Cruzada K-Fold
</br>
</p>
