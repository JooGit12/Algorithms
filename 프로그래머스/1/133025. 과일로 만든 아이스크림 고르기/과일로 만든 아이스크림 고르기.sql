-- 코드를 입력하세요
select flavor
from first_half
where flavor in (select flavor
from icecream_info
where ingredient_type = 'fruit_based') and total_order > 3000
order by total_order desc;
