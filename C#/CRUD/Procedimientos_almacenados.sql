CREATE PROCEDURE USP_LISTADO_PR
	@cTexto varchar(80) = ''
	AS

	SELECT a.codigo_pr, a.descripcion_pr, a.marca_pr,
	b.descripcion_me,
	c.descripcion_ca,
	a.stock_actual,
	a.codigo_me,
	a.codigo_ca
	FROM TB_PRODUCTOS a
	INNER JOIN TB_MEDIDAS b 
		ON a.codigo_me=b.codigo_me
	INNER JOIN TB_CATEGORIAS c
		ON a.codigo_ca=c.codigo_ca
	where a.activo = 1 and 
	upper(trim(a.descripcion_pr)) + trim(a.marca_pr) like '%' + upper(trim(@cTexto)) + '%'
	order by a.codigo_pr
GO



CREATE PROCEDURE USP_GUARDAR_PR
	@Opcion int = 1	,-- 1=nuevo registro, 2=Actualiza registro
	@nCodigo_pr int,
	@cDescripcion_pr varchar(80),
	@cMarca_pr varchar(30),
	@nCodigo_me int,
	@nCodigo_ca int,
	@nStock_actual decimal(18,0)

AS

	IF @Opcion = 1
		BEGIN
			INSERT INTO TB_PRODUCTOS
			(descripcion_pr, marca_pr,codigo_me, codigo_ca, stock_actual, fecha_cre, activo)
			VALUES(@cDescripcion_pr, @cMarca_pr, @nCodigo_me, @nCodigo_ca, @nStock_actual, getdate(),1);
		END;
	ELSE
		BEGIN
			UPDATE TB_PRODUCTOS SET 
			descripcion_pr = @cDescripcion_pr, marca_pr = @cMarca_pr, codigo_me = @nCodigo_me, codigo_ca = @nCodigo_ca, stock_actual = @nStock_actual
			where codigo_pr = @nCodigo_pr;
		END;

GO

create procedure activo_pr
	@nCodigo_pr int,
	@bEstado_activo bit
	AS
	UPDATE TB_PRODUCTOS SET activo = @bEstado_activo
	where codigo_pr = @nCodigo_pr;

GO


CREATE procedure  SP_LISTADO_ME
AS
	SELECT DESCRIPCION_ME, CODIGO_ME
	FROM TB_MEDIDAS
	WHERE ACTIVO = 1


GO

CREATE procedure USP_LISTADO_CA
AS
	SELECT DESCRIPCION_CA, CODIGO_CA 
	FROM TB_CATEGORIAS
	WHERE activo = 1
