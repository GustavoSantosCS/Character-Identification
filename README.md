<h3 align="center"> Neural Network - Character Identification </h3>

## Equipe
 - Gustavo de Carvalho Santos
 - Paulo Henrique Rodrigues

## Problema
<p>Reconhecimento de números de 0 à 9 através imagens em uma rede neural. Escolhemos este problema, por se tratar de uma aplicação que está cada vez mais presente no dia a dia, como por exemplo o reconhecimento de placas de veículos com base em imagens. Outra característica que nos desafiou a escolher e formular este problema, é a maneira infinita de possibilidades de escrever qualquer número, onde cada pessoa possui sua própria característica de escrita e como seria a identificação desta escrita numérica.</p>

## Dataset
<p>THE MNIST DATABASE - http://yann.lecun.com/exdb/mnist/</p>

Dataset composto por uma coleção de imagens de dígitos manuscritos.<br/>
O banco de dados MNIST contém 60.000 imagens de treinamento e 10.000 imagens de teste.</p>

<p>Exemplo do dataset MNIST</p>
<p align="center">
<img src="https://upload.wikimedia.org/wikipedia/commons/2/27/MnistExamples.png" />
</p>


## Técnica
<p>A solução para o problema descrito neste trabalho é a criação de um aplicativo Android nativo, onde o usuário escreve um dígito, é gerado uma imagem com o dígito escrito e redimensionado para 28x28 pixels. A imagem é dimensionada neste tamanho, pois são as dimensões das imagens compostas no banco de dados Mnist, permitindo uma comparação real e padrão com o dataset.
</p>

<p>Após a Geração da imagem, a mesma é fornecida como parâmetro a um método que executa a Rede Neural escrita em Python através da Biblioteca TensorFlow, onde resulta o dígito que a rede neural processou e definiu como mais parecido de acordo com o dataset</p>

<p>A rede neural possui a seguinte estrutura:</p>
<p align="center">
<img src="https://i.ibb.co/hg0QYct/Untitled-Diagram.png" />
</p>

## Resultados obtidos
<p>
Foi feita uma pesquisa com o objetivo de obter modelos de redes neurais já utilizados para suprir a necessida.
</p>

Três modelos foram selecionados!

<h2>Modelo 1</h2>
<h3>Autor: Ellie Birbeck</h3>
<p>Disponivel: <a href ="https://www.tensorflow.org/datasets/keras_example">Aqui </a>
<p align="center">
<img src="https://i.ibb.co/G5vQYyF/Modelo-1.png">
</p>
</p>

<h2>Modelo 2</h2>
<h3>Autor: TensorFlow</h3>
<p>Disponivel <a href ="https://www.digitalocean.com/community/tutorials/como-construir-uma-rede-neural-para-reconhecer-digitos-manuscritos-com-o-tensorflow-pt">Aqui </a>
<p align="center">
<img src="https://i.ibb.co/sv6snqd/Modelo-2.png"/>
</p>
</p>

<h2>Modelo 3</h2>
<h3>Autor: Fernando Amaral</h3>
<p>Disponivel 
<a href ="https://www.udemy.com/course/inteligencia-artificial-e-machine-learning/">no curso</a>
<p align="center">
<img src="https://i.ibb.co/XxtYNL2/Modelo-3.png"/>
</p>
</p>

Todos os três modelos foram treinados com as seguintes configurações:
<ul>
<li>
Numero de Eras: 7
</li>
<li>
Divisão do Dataset: 60.000 imagens para treinamento e 10.000 para testes
</li>
<li>
Foram feitos 5 treinamentos sendo que a cada treinamento os pesos dos neurônios da rede eram  zerados 
</li>
</ul>
<p>
Esse experimento tinha como objetivo escolher as duas melhores redes neurais, tendo como métrica de análise: (i) a media da acurácia; (ii) o desvio padrão da acurácia.
</p>

Os seguinte resultados foram obtidos: 
<ul>
<li><strong>Modelo 1</strong> teve uma acurácia media de 0,94 e um desvio padrão de 0,0035;</li> 
<li><strong>Modelo 2</strong> teve uma acurácia media de 0,98 e um desvio padrão de 0,15;</li>
<li><strong>Modelo 3</strong> teve uma acurácia media de 0,56 e um desvio padrão de 0,0024;</li>  
</ul>

<p>
Com os resultados obtidos o Modelo 1 e o Modelo 2 foram os escolhidos para os experimentos. Os experimentos tinham como objetivo adicionar e remover camadas e incrementar ou decrementar o dropout das camadas.
Todos os exprementos realizado estão documentados <a href="https://drive.google.com/file/d/1et95cqNTDpnJH4UmRv8br0_51JhqALhY/view?usp=sharing">aqui</a>. Não foram testados todos as combinações possíveis, sempre que uma modificação apresentava variações positivas, a característica modifica era modifica novamente para um novo experimento. Em caso de resultados piores que o origina não se seguia com os experimentos.
</p>
<p>
Praticamente todos exprimento não apresentaram mudanças significativas na media da acurácia. A variavel que mais teve mudança foi o desvio padrão.
</p>

A configuração do Modelo Escolhido: 
<p align="center">
<img src="https://i.ibb.co/0rxCmyG/Modelo-Escolhido.png"/>
</p>
Tanto o Modelo 1 como o Modelo 2 possuem acurácias medias alta e que pouco flutuaram durante os experimentos! A maioria das flutuações eram para valores piores. O modelo de maior destaque foi o modelo apresentado na figura acima.
Esse é uma variação do Modelo do Tensorflow, tem como diferencia um dropout de 10% em vez dos 20% do modelo original. Outro fator que influenciou na escolha foi o tamanho da rede neural. Os dois modelos apresentaram resultados muitos proximos, logo optou-se pela rede de menor tamanho, conforme a indicação da literatura.
</br></br>

## Instruções de uso do software

<p>Na pasta APK/release, localizada neste repositório,  baixar o arquivo app-release.apk, e instalar em um smartphone Android, lembrando que devesse autorizar a instalação de aplicativo de outras fontes. Após instalação abrirá o aplicativo conforme a tela a seguir:</p>

<p align="center">
<img src="http://phrempreendimentos.com.br/wp-content/uploads/2020/09/WhatsApp-Image-2020-09-13-at-17.52.19-e1600106821265.jpeg"/>
</p>

## Vídeo
<p>https://web.microsoftstream.com/video/fcb67f3e-0ab4-46a3-9590-0f2898b743f1</P>


