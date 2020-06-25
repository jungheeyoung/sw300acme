<template>
    <v-container>
        <div class="map">
            <center>
                <GmapMap
                        :center="{lat:36.561249, lng: 128.011285}"
                        :zoom="7"
                        map-type-id="terrain"
                        style="width: 500px; height: 300px"
                >
                    <GmapMarker
                            :key="index"
                            v-for="(m, index) in markers"
                            :position="m.position"
                            :clickable="true"
                            :draggable="true"
                            @click="clickMarker"
                    />
                </GmapMap>
                <br>
                <get-area v-if="step === 1" :selectedArea.sync="selectedArea" :step.sync="step"></get-area>
            </center>
        </div>
    </v-container>
</template>

<script>
    import GetArea from "./GetArea";

    export default {
        name: 'map',

        components: { GetArea },
        data() {
            return {
                markers: [{
                    position: {
                        lat:37.532600, lng:127.024612
                    }
                }, {
                    position: {
                        lat:35.476765, lng:127
                    }
                }, {
                    position: {
                        lat:35.826201, lng:128.609261
                    }
                }, {
                    position: {
                        lat:36.429016, lng:126.813206
                    }
                }, {
                    position: {
                        lat:36.561249, lng:128.011285
                    }
                }],
                //course
                step: 1,
                selectedCourse: null,
                selectedClass: null,

                errors: []
            };
        },
        methods: {
            clickMarker: function () {
                this.$dialog.confirm({
                    text: "What's your name? <img src='https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Natgeologo.svg/1200px-Natgeologo.svg.png' height=100/><input value='input'></input>", title: 'Warning'});
            }
        }
    };

</script>
