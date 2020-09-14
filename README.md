<h3 align="center"> Neural Network - Character Identification </h3>

## Equipe
 - Gustavo de Carvalho Santos
 - Paulo Henrique Rodrigues

## Problema
<p>Reconhecimento de números de 0 à 9 através imagens em uma rede neural. Escolhemos este problema, por se tratar de uma aplicação que está cada vez mais presente no dia a dia, como por exemplo o reconhecimento de placas de veículos com base em imagens. Outra característica que nos desafiou a escolher e formular este problema, é a maneira infinita de possibilidades de escrever qualquer número, onde cada pessoa possui sua própria característica de escrita e como seria a identificação desta escrita numérica.</p>

## Dataset
<p>THE MNIST DATABASE - http://yann.lecun.com/exdb/mnist/</p>

<br>Dataset composto por uma coleção de imagens de dígitos manuscritos.<br/>
O banco de dados MNIST contém 60.000 imagens de treinamento e 10.000 imagens de teste.</p>

<p>Exemplo do dataset MNIST</p>

<img src="https://upload.wikimedia.org/wikipedia/commons/2/27/MnistExamples.png" />


## Técnica
<p>A solução para o problema descrito neste trabalho é a criação de um aplicativo Android nativo, onde o usuário escreve um dígito, é gerado uma imagem com o dígito escrito e redimensionado para 28x28 pixels. A imagem é dimensionada neste tamanho, pois são as dimensões das imagens compostas no banco de dados Mnist, permitindo uma comparação real e padrão com o dataset.</p>

<p>Após a Geração da imagem, a mesma é fornecida como parâmetro a um método que executa a Rede Neural escrita em Python através da Biblioteca TensorFlow, onde resulta o dígito que a rede neural processou e definiu como mais parecido de acordo com o dataset</p>

<p>A rede neural possui a seguinte estrutura:</p>
<img src="http://phrempreendimentos.com.br/wp-content/uploads/2020/09/Teste.jpg" />

## Resultados obtidos
<p>Nos links a seguir serão abordados 3 modelos de Redes Neurais, onde efetuamos os testes, medimos a acurária de cada. Posteriormente fizemos alterações e medimos novamente a acurácia</p>

<p>https://drive.google.com/file/d/1et95cqNTDpnJH4UmRv8br0_51JhqALhY/view?usp=sharing</p>
<p>https://drive.google.com/file/d/1mCjqY9GYMRAedodwCM7bxAQiVbMuZKIq/view?usp=sharing</p>

## Instruções de uso do software

<p>Na pasta executável, localizada neste repositório,  baixar o arquivo xxxxx.apk, e instalar em um smartphone Android. Após instalação abrirá o aplicativo  conforme a tela a seguir:</p>

<img src="http://phrempreendimentos.com.br/wp-content/uploads/2020/09/WhatsApp-Image-2020-09-13-at-17.52.19-e1600106821265.jpeg"/>

## Vídeo
<p>https://web.microsoftstream.com/video/fcb67f3e-0ab4-46a3-9590-0f2898b743f1</P>


