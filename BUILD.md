 To build your plugin run:

```
mvn clean install
```

That will build, run the tests and assemble the plugin into:

```
target/<version>
```


If you have a local Funnelback and SEARCH_HOME is defined you can install
the plugin into funnelback with:

```
mvn clean install -Pinstall-local
```

if you have Funnelback installed on a remote server, you can rsync the plugin
over with:

```
mvn clean install -Pinstall-remote-rsync
```

Running that command will outline what needs to be done to set the remote host,
user and remote search home.


That can be installed into Funnelback
```
/opt/funnelback/share/plugins/<plugin-name>/
```

e.g.

```
cp -a target/<version> /opt/funnelback/share/plugins/<plugin-name>/
```
