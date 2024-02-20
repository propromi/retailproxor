<!DOCTYPE html>
<html>
<head>
    <title>Proxor's shop</title>
</head>
<body>
<h1>BUYSELL shop</h1>
<hr>
<h4>Подробная информацмя о товаре</h4>
<b>название товара: </b>${product.name}<br>
<b>Цена: </b>${product.price}<br>
<hr>
<h3>Действия с товаром</h3>
<form action="/product/delete/${product.id}" method="post">
    <input type="submit" value="Удалить товар">
</form>
</body>
</html>