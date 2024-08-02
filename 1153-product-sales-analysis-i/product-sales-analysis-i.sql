# Write your MySQL query statement below
#select product_name,year,price from Sales
#left join Product
#on Sales.product_id=Product.product_id
SELECT p.product_name,s.year,s.price from Sales s,Product p where p.product_id = s.product_id