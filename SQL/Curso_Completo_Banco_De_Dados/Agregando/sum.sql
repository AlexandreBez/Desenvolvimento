SELECT SUM(JANEIRO) AS TOTAL_JAN
FROM VENDEDORES

SELECT SEXO, SUM(JANEIRO) AS TOTAL_JAN
FROM VENDEDORES
GROUP BY SEXO;