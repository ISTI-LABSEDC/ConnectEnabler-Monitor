# ConnectEnabler-Monitor
The prototype version of one of the Connect Architecture Enabler: Monitoring

The deployment and the execution of applications on dynamic runtime infrastructures introduces new requirements of adaptability with respect to monitoring. Specifically, the governance of services relies on the observation and analysis of events happening at different abstraction layers. Adaptability requirements are even more evident when monitoring deals with Service Level Agreements (SLA) or KPI (Key Performance Indicator).
The proposed monitoring infrastructure keeps track of the continuous evolution of the underlying environment, and adapt itself accordingly.
The multi-source monitoring architecture developed by SEDC Laboratory that can synthesize on-the-fly SLA/KPI monitoring rules following the evolution of the infrastructure.

GLIMPSE Transmitted Data Structure

#ComplexEventRule:
The XSD of the ObjectMessage sent by the GlimpseConsumer to request an evaluation.

#GlimpseBaseEvent<?>:
The object sent into the data field of the ObjectMessage sent by the GlimpseProbe to Glimpse

#ComplexEventException:
The XSD of the ObjectMessage sent by GlimpseManager to notify to the GlimpseConsumer an exception occurred into the SUT.

#ComplexEventResponse:
The XSD of the ObjectMessage sent by GlimpseManager to notify an occurrence of the requested pattern to the GlimpseConsumer.

#Requirements

    ServiceMix4: http://servicemix.apache.org/SMX4/download.html
    A client able to send and receive JMS messages

