package com.lab.kafkaclient.consumer;

import java.util.Properties;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

public class KafkaClient {

    private String bootstrapServer = "127.0.01:9092";
    private String groupId = "consumer1";
    private String topic = "first_topic";


}
