SELECT seller.*, department.name as DepName
from  seller inner join department
on seller.department_id = department.id
where seller.id = 3; 