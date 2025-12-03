## **HU-01: Login de Operadores**

Como operador

Quiero acceder al sistema con mi usuario y contraseña

Para gestionar únicamente las alertas que me correspondan

*Feature: Login de Operadores*

    Scenario: Operador ingresa con credenciales válidas
  
    Given un operador con usuario "usuario1" y contraseña "pass123"  
    
    When el operador intenta iniciar sesión  
    
    Then el operador debe acceder al sistema  
    
    And solo podrá ver las alertas asignadas a su rol


## **HU-02: Panel de Alertas**

Como operador

Quiero ver un panel con todas las alertas generadas

Para darles seguimiento oportuno

*Feature: Panel de Alertas*

    Scenario: Visualizar todas las alertas
  
    Given el operador ha iniciado sesión
    
    When accede al panel de alertas
    
    Then debe ver todas las alertas en orden cronológico
    
    And podrá identificar las alertas pendientes de atención


## **HU-03: Gestión de Alertas**

Como operador

Quiero crear, editar, consultar y eliminar alertas

Para personalizar el sistema de acuerdo con las necesidades operativas

*Feature: Gestión de Alertas*

    -Scenario: Crear una nueva alerta
  
    Given el operador está en el panel de alertas
    
    When crea una alerta con nivel de prioridad "Alta" y asigna un responsable
    
    Then la alerta debe guardarse correctamente en el sistema



    -Scenario: Editar una alerta existente
  
    Given una alerta existente en el sistema
    
    When el operador modifica su prioridad y responsable
    
    Then la alerta debe actualizarse con los nuevos datos



    -Scenario: Eliminar una alerta
    
    Given una alerta existente en el sistema
    
    When el operador elimina la alerta
    
    Then la alerta no debe aparecer más en el panel
    

## **HU-04: Dashboard Estadístico de Alertas Recurrentes**

Como operador

Quiero visualizar un reporte de alertas recurrentes con gráficos y tablas

Para analizar tendencias y exportar datos

*Feature: Dashboard Estadístico de Alertas Recurrentes*

    Scenario: Visualizar dashboard de alertas recurrentes
    
    Given el operador ha iniciado sesión
    
    When accede al dashboard de alertas recurrentes
    
    Then debe ver un gráfico estadístico de incidentes
    
    And una tabla con los incidentes registrados
    
    And podrá exportar la tabla en formato CSV


## **HU-05: Envío Automático de Notificaciones**

Como administrador del sistema

Quiero que se envíen notificaciones automáticas

Para mantener informados a los responsables y conductores

*Feature: Envío Automático de Notificaciones*

    -Scenario: Notificación a responsables de alerta
    
    Given se genera una nueva alerta
    
    When la alerta se guarda en el sistema
    
    Then se debe enviar un correo electrónico al responsable asignado
    

    -Scenario: Notificación a conductores
    
    Given se genera una nueva alerta
    
    When la alerta se guarda en el sistema
    
    Then se debe enviar un mensaje interno a los conductores involucrados


