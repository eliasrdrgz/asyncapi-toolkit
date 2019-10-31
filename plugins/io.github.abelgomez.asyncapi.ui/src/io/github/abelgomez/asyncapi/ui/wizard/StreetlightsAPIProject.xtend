package io.github.abelgomez.asyncapi.ui.wizard

import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Status
import org.eclipse.jdt.core.JavaCore
import org.eclipse.xtext.ui.XtextProjectHelper
import org.eclipse.xtext.ui.util.PluginProjectFactory
import org.eclipse.xtext.ui.wizard.template.IProjectGenerator
import org.eclipse.xtext.ui.wizard.template.ProjectTemplate

import static org.eclipse.core.runtime.IStatus.*

@ProjectTemplate(label="Streetlights API Example Project", icon="asyncapi_project_template.png", description="<p><b>Streetlights API</b></p>
<p>This is an example for AsyncApi v2.0.0. You can set the package the file is created in.</p>")
final class StreetlightsAPIProject {
	val advanced = check("Advanced:", false)
	val advancedGroup = group("Properties")
	val path = text("Package:", "streetlights", "The package path to place the files in", advancedGroup)

	override protected updateVariables() {
		path.enabled = advanced.value
		if (!advanced.value) {
			path.value = "streetlights"
		}
	}

	override protected validate() {
		if (path.value.matches('[a-z][a-z0-9_]*(/[a-z][a-z0-9_]*)*'))
			null
		else
			new Status(ERROR, "Wizard", "'" + path + "' is not a valid package name")
	}

	override generateProjects(IProjectGenerator generator) {
		generator.generate(new PluginProjectFactory => [
			projectName = projectInfo.projectName
			location = projectInfo.locationPath
			projectDefaultCharset = "UTF-8"
			projectNatures += #[JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature", XtextProjectHelper.NATURE_ID]
			builderIds += #[JavaCore.BUILDER_ID, XtextProjectHelper.BUILDER_ID]
			folders += "src"
			folders += "src-gen"
			addFile('''src/«path»/StreetlightsAPI.asyncapi''', '''
				{
				  "asyncapi": "2.0.0",
				  "info": {
				    "title": "Streetlights API",
				    "version": "1.0.0",
				       "description": "The Smartylighting Streetlights API allows you to remotely manage the city lights.\n\n### Check out its awesome features:\n\n* Turn a specific streetlight on/off 🌃\n* Dim a specific streetlight 😎\n* Receive real-time information about environmental lighting conditions 📈\n",
				    "license": {
				      "name": "Apache 2.0",
				      "url": "https://www.apache.org/licenses/LICENSE-2.0"
				    }
				  },
				  "servers": {
				    "production": {
				      "url": "localhost:{port}",
				      "protocol": "mqtt",
				      "description": "Test broker",
				      "variables": {
				        "port": {
				          "description": "Secure connection (TLS) is available through port 8883.",
				          "default": "1883",
				          "enum": [
				            "1883",
				            "8883"
				          ]
				        }
				      },
				    }
				  },
				  "channels": {
				    "smartylighting/streetlights/1/0/event/{streetlightId}/lighting/measured": {
				      "description": "The topic on which measured values may be produced and consumed.",
				      "parameters": {
				        "streetlightId": {
				          "$ref": "#/components/parameters/streetlightId"
				        }
				      },
				      "subscribe": {
				        "summary": "Receive information about environmental lighting conditions of a particular streetlight.",
				        "operationId": "receiveLightMeasurement",
				        "message": {
				          "$ref": "#/components/messages/lightMeasured"
				        }
				      },
					  "publish": {
				        "summary": "Publish information about environmental lighting conditions of a particular streetlight.",
				        "operationId": "sendLightMeasurement",
				        "message": {
				          "$ref": "#/components/messages/lightMeasured"
				        }
				      }
				    },
				    "smartylighting/streetlights/1/0/action/{streetlightId}/turn/on": {
				      "parameters": {
				        "streetlightId": {
				          "$ref": "#/components/parameters/streetlightId"
				        }
				      },
				      "publish": {
				        "operationId": "turnOn",
				        "message": {
				          "$ref": "#/components/messages/turnOnOff"
				        }
				      }
				    },
				    "smartylighting/streetlights/1/0/action/{streetlightId}/turn/off": {
				      "parameters": {
				        "streetlightId": {
				          "$ref": "#/components/parameters/streetlightId"
				        }
				      },
				      "publish": {
				        "operationId": "turnOff",
				        "message": {
				          "$ref": "#/components/messages/turnOnOff"
				        }
				      }
				    },
				    "smartylighting/streetlights/1/0/action/{streetlightId}/dim": {
				      "parameters": {
				        "streetlightId": {
				          "$ref": "#/components/parameters/streetlightId"
				        }
				      },
				      "publish": {
				        "operationId": "dimLight",
				        "message": {
				          "$ref": "#/components/messages/dimLight"
				        }
				      }
				    }
				  },
				  "components": {
				    "messages": {
				      "lightMeasured": {
				        "name": "lightMeasured",
				        "title": "Light measured",
				        "summary": "Inform about environmental lighting conditions for a particular streetlight.",
				        "payload": {
				          "$ref": "#/components/schemas/lightMeasuredPayload"
				        }
				      },
				      "turnOnOff": {
				        "name": "turnOnOff",
				        "title": "Turn on/off",
				        "summary": "Command a particular streetlight to turn the lights on or off.",
				        "payload": {
				          "$ref": "#/components/schemas/turnOnOffPayload"
				        }
				      },
				      "dimLight": {
				        "name": "dimLight",
				        "title": "Dim light",
				        "summary": "Command a particular streetlight to dim the lights.",
				        "payload": {
				          "$ref": "#/components/schemas/dimLightPayload"
				        }
				      }
				    },
				    "schemas": {
				      "lightMeasuredPayload": {
				        "type": "object",
				        "properties": {
				          "lumens": {
				            "type": "integer",
				            "minimum": 0,
				            "description": "Light intensity measured in lumens."
				          },
				          "sentAt": {
				            "$ref": "#/components/schemas/sentAt"
				          }
				        }
				      },
				      "turnOnOffPayload": {
				        "type": "object",
				        "properties": {
				          "command": {
				            "type": "string",
				            "enum": [
				              "on",
				              "off"
				            ],
				            "description": "Whether to turn on or off the light."
				          },
				          "sentAt": {
				            "$ref": "#/components/schemas/sentAt"
				          }
				        }
				      },
				      "dimLightPayload": {
				        "type": "object",
				        "properties": {
				          "percentage": {
				            "type": "integer",
				            "description": "Percentage to which the light should be dimmed to.",
				            "minimum": 0,
				            "maximum": 100
				          },
				          "sentAt": {
				            "$ref": "#/components/schemas/sentAt"
				          }
				        }
				      },
				      "sentAt": {
				        "type": "string",
				        "format": "date-time",
				        "description": "Date and time when the message was sent."
				      }
				    },
				    "parameters": {
				      "streetlightId": {
				        "description": "The ID of the streetlight.",
				        "schema": {
				          "type": "string"
				        }
				      }
				    }
				  }
				}
			''')
			addFile('''src/main/MainExample.java''', '''
				package main;
				
				import java.text.MessageFormat;
				import java.time.LocalDateTime;
				import java.util.UUID;
				
				import schemas.LightMeasuredPayload;
				import smartylighting.streetlights._1._0.event.__streetlightId_.lighting.measured.PublishLightMeasured;
				import smartylighting.streetlights._1._0.event.__streetlightId_.lighting.measured.PublishLightMeasured.PublishLightMeasuredParams;
				import smartylighting.streetlights._1._0.event.__streetlightId_.lighting.measured.SubscribeLightMeasured;
				
				public class MainExample {
					public static void main(String[] args) throws Exception {
						
						SubscribeLightMeasured.subscribe((params, message) -> {
							System.err.println(MessageFormat.format(
									"Subscription to ''{0}'' with ID ''{1}'':\n{2} lumens at {3}",
									SubscribeLightMeasured.TOPIC_ID, params.getStreetlightId(), message.getLumens(), message.getSentAt()));
						});
				
						for (int i = 0; i < 3; i++) {
							LightMeasuredPayload payload = PublishLightMeasured.payloadBuilder()
									.withLumens(10)
									.withSentAt(LocalDateTime.now().toString())
									.build();
							
							PublishLightMeasuredParams params = PublishLightMeasuredParams.create()
									.withStreetlightId(UUID.randomUUID().toString());
							
							System.out.println(MessageFormat.format(
									"Publishing at ''{0}'':\n{1}",
									PublishLightMeasured.expand(params), payload.toJson(true)));
							
							PublishLightMeasured.publish(payload, params);
						}
						
						SubscribeLightMeasured.unsubscribe();
					}
				}
			''')
			addFile('''ivy.xml''', '''
				<ivy-module version="2.0">
				    <info organisation="com.example" module="mymodule"/>
				    <dependencies>
				        <dependency org="com.google.code.gson" name="gson" rev="2.8.5"/>
				        <dependency org="org.eclipse.paho" name="org.eclipse.paho.client.mqttv3" rev="1.2.1"/>
				    </dependencies>
				</ivy-module>
			''')
			addClasspathEntries = JavaCore.newContainerEntry(new Path("org.apache.ivyde.eclipse.cpcontainer.IVYDE_CONTAINER/?project=" + projectInfo.projectName + "&ivyXmlPath=ivy.xml&confs=*&acceptedTypes=jar%2Cbundle%2Cejb%2Cmaven-plugin%2Ceclipse-plugin&alphaOrder=false&resolveInWorkspace=false&transitiveResolve=true&readOSGiMetadata=false&retrievedClasspath=false"))
		])
	}
}
