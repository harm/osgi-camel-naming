# osgi-camel-naming

To run start Karaf container:
`./bin/karaf`

`bundle:install mvn:nl.dovetail.esb/naming-server/1.0-SNAPSHOT`
`bundle:install mvn:nl.dovetail.esb/naming-client/1.0-SNAPSHOT`

`bundle:list`
(look up ids)
`bundle:start 64 65`

Tail the log
