<html>

<head>
<title>Chceš znát čas brácho?</title>
</head>
<body>

<%      Object prvni = request.getAttribute("p");
        Object druhy = request.getAttribute("d");
        Object treti = request.getAttribute("t");
        Object vysledek = request.getAttribute("v");
%>
<p>Cisla jsou: <%=prvni %>  <%=druhy %> <%=treti %></p>
<p>Nejvetsi cislo je: <%=vysledek %> </p>
</body>
</html>