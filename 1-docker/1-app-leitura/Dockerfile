FROM golang:1.5
WORKDIR /go/src/teste

COPY . .

RUN GOOS=linux go build -ldflags="-s -w"
RUN ls -la
CMD ["./teste"]