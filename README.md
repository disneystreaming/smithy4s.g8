A simple Giter8 template to generate a http4s server that read/write json via [smithy4s](https://github.com/disneystreaming/smithy4s) codegen tool.

![CI](https://github.com/disneystreaming/smithy4s.g8/actions/workflows/ci.yml/badge.svg)

# Usage

The command below will generate a project that works with the latest version of Smithy4s. If you decide to go with another version, you might need to adjust the generated project to make it work.

`sbt new disneystreaming/smithy4s.g8`

# SBT / Mill

You will be prompted for the build tool you want to generate a build for. By default, SBT is selected. For mill, reply "no" to "sbt",
and "yes" to "mill".


## how-to run?

When generated, hop into the resulting directory and do: `sbt run` or `mill service.run` respectively.

In a separate terminal, you'll be able to do:

```
curl 'http://localhost:9000/hello/world'
{"greeting":"Hi world"}⏎
```

Or view docs in the browser: `open http://localhost:9000/docs`.
