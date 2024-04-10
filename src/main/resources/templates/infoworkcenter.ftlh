<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<h1>Цех №3 Механический</h1>
<h4>Подробная информация</h4>
<b>Название рабочего центра: </b>${machines.title}<br>
<b>Код рабочего центра: </b>${machines.code}<br>
<b>Узел ПЛМ: </b>${machines.plm}<br>
<hr>
<h3>Добавить рабочий центр</h3>
<form action="/WorkCenter/delete/${machines.id}" method="post">
    <input type="submit" value="Удалить">
</form>
</body>
</html>