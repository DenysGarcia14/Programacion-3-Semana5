# Diagrama de Clases - Jerarquía de Herencia

```mermaid
classDiagram
    class ComprobanteVenta {
        #String numeroReferencia
        #String fecha
        #double montoTotal
        +presentarse() String
    }

    class Cotizacion {
        -String fechaVencimiento
        +firmarCotizacion() void
        +toString() String
    }

    class Factura {
        -String metodoPago
        -boolean pagado
        +procesarPago() void
        +toString() String
    }

    ComprobanteVenta <|-- Cotizacion : es un
    ComprobanteVenta <|-- Factura : es un