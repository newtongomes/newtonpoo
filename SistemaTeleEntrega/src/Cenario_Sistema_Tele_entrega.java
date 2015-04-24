public class Cenario_Sistema_Tele_entrega {}

/*
 * Projeto para Atividade Estruturada
 * FIC - Programação Orientada a Ojetos
 * 2012.2
 * Newton Gomes - 17/10/2012
 * Sistema de Tele-Entregas com Vendas através de Pedidos por Telefone
 *

Sistema de Tele-Entregas

CENÁRIO DO NEGÓCIO:
-------------------

O Sistema deverá realizar o cadastro e controle dos Pedidos realizados por 
Clientes cadastrados a partir de uma ligação telefônica e fazendo o 
acompanhamento do pedido desde sua criação, até o estado de concluído (fechado), 
quando o mesmo foi enviado ao Cliente, e já recebeu o retorno de confirmação 
do recebimento do Pedido pelo Cliente.

O Cliente liga para a Central de Pedidos da Empresa, e informa seu nome e/ou 
telefone e/ou CPF, que devem ser utilizados para localização dos clientes 
cadastrados, e caso seja a primeira ligação do Cliente, será solicitado suas 
informações básicas para cadastro no Sistema. Caso o cliente já esteja 
cadastrado, serão apresentadas as informações atuais do cadastro para sua 
confirmação. Será possível a atualização dos dados do Cliente, caso estejam 
com dados incorretos.

Após a confirmação do cadastro de Cliente, será iniciado o Pedido, onde o 
cliente informa os produtos desejados, juntamente com a quantidade do pedido. 
A cada produto, o sistema localiza o produto pelo nome/parte e mostra uma lista 
de produtos pesquisados, e após escolher o produto desejado, inclui na lista e 
pedido de cliente. O cliente informa a quantidade requerida e o produto é 
registrado no Pedido. Poderá haver desistência (cancelamento) de produtos do 
Pedido e também a mudança da quantidade do Pedido. O preço do produto não 
poderá ser alterado. O Pedido poderá ser alterado ou cancelado, acrescentando 
informações complementares ou mudando o estado do Pedido (Cancelado).

Após confirmado o Pedido com o cliente, o sistema emitirá uma cópia do pedido 
a ser encaminhada para um dos entregadores cadastrados no sistema, permanecendo 
no estado de aberto. Após a entrega e confirmação do pedido entregue, deverá ser 
feita a baixa do pedido, informando os dados do pagamento do cliente (dinheiro, 
cartão, cheque) e uma observação de livre digitação.

O Sistema deverá ser acessado apenas por usuários cadastrados, com autenticação 
de senha de acesso.

O Sistema permitirá a manutenção do Cadastro de Produtos disponíveis para venda, 
permitindo ainda a consulta de produtos e alteração dos dados quando necessário. 
O produto que tiver como preço zerado, indicará que não deverá ser vendido, pois 
não tem disponibilidade para vendas.

O Sistema deverá emitir uma relação dos pedidos cadastrados por data, indicando 
o estado de cada pedido listado e ainda as informações gerais do Pedido.


* Organizar as classes do Projeto em pacotes especializados

* Opções do Programa:

  - Cadastros: Clientes, Produtos, Entregadores, Usuários

  - Pedidos: Novo Pedido, Editar Pedido, Painel de Pedidos

  - Consultas: Pedido para Entrega, Pedidos do Dia

  - Sistema: Sair, Sobre


*/

