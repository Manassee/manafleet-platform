# 🚛 ManaFleet Platform

**Intelligente Fleet-Tracking- und Analyseplattform für moderne Unternehmensumgebungen**

ManaFleet ist eine skalierbare, serviceorientierte Flottenmanagement-Plattform zur **Echtzeit-Fahrzeugverfolgung**, **automatisierten Wartungssteuerung** und **datengetriebenen Flottenanalyse**.

Das System wurde als **Java Spring Boot Microservice-Architektur** konzipiert und ist für die nahtlose Integration in Enterprise-Ökosysteme – insbesondere in das ManaPulse ERP (.NET) – ausgelegt.

---

## 🎯 Ziel des Projekts

Ziel von ManaFleet ist der Aufbau einer modularen, hochskalierbaren Plattform zur Verwaltung und Optimierung von Unternehmensflotten.

Die Plattform unterstützt Unternehmen dabei:

- Fahrzeugbewegungen in Echtzeit zu überwachen  
- Wartungszyklen automatisiert zu steuern  
- Kosten und Auslastung zu analysieren  
- Geofencing-Events zu verarbeiten  
- ERP-gestützte Serviceprozesse auszulösen  

---

## ✨ Kernfunktionen

### 🚗 Fleet Core Management

- Verwaltung von Fahrzeugen, Fahrern und Flotten  
- Multi-Tenant-Unterstützung  
- Fahrzeugstatus (Aktiv / Wartung / Außer Betrieb)  
- Historie von Fahrer-Fahrzeug-Zuweisungen  

### 📍 Echtzeit-Tracking

- Live-GPS-Tracking via WebSocket  
- Standort-Historie (append-only Time-Series)  
- Geofencing (Eintritts- / Austritts-Events)  

### 🔧 Wartungs- & Lifecycle-Management

- Automatische Wartungsplanung (zeit- oder kilometerbasiert)  
- Benachrichtigungen bei fälliger Wartung  
- ERP-Integration zur automatischen Erstellung von Serviceaufträgen  

### 📊 Analytics & Reporting

- KPI-Dashboards (Distanz, Leerlaufzeit, Auslastung, Routen-Effizienz)  
- CSV- und PDF-Export  
- Optional: Materialisierung täglicher Kennzahlen  

---

## 🏗 Architektur

ManaFleet basiert auf einer serviceorientierten Microservice-Architektur.

### Technologie-Stack

- **Backend:** Java 21  
- **Framework:** Spring Boot  
- **Build-Tool:** Maven oder Gradle  
- **Datenbank:** PostgreSQL  
- **Messaging (optional):** Kafka oder RabbitMQ  
- **Kommunikation:** REST APIs + WebSocket  
- **Containerisierung:** Docker  
- **Deployment:** Cloud-ready (z. B. Azure, Kubernetes)  

---

## 🔗 Integration in ManaPulse ERP

ManaFleet ist als eigenständiger Service konzipiert und kommuniziert mit dem ManaPulse ERP (.NET) über:

- REST-Schnittstellen  
- Event-basierte Kommunikation (optional)  
- Service-zu-Service-Authentifizierung (JWT / OAuth2)  

Dadurch bleibt die Architektur:

- lose gekoppelt  
- skalierbar  
- erweiterbar für weitere ManaVision-Module  

---

## 🚀 Projektstatus

> 🛠 In aktiver Entwicklung

Geplante nächste Schritte:

- Basis-Domain-Model implementieren  
- Tracking-Controller + WebSocket Gateway entwickeln  
- Wartungslogik-Service implementieren  
- PostgreSQL-Migrationen erstellen  
- Docker-Setup konfigurieren  

---

## 📦 Projektstruktur (Beispiel)
